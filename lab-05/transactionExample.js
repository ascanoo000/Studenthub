// transactionExample.js
const pool = require('./db');

async function basicCrud() {
    let conn;
    try {
      conn = await pool.getConnection();
  
      const studentId = 'S10811003';
      const newName='陳大華';
      
      const result = await conn. query ('SELECT * FROM STUDENT WHERE Student_ID = ?', [studentId] );
      
      if (result. length === 0)
      console.log('查無此人');
      return;
      
      await conn.query('UPDATE STUDENT SET Name = ? WHERE Student_ID = ?', [newName, studentId] );
      console.log('已更新學生名稱');
      
    } catch (err) {
      console.error('操作失敗：', err);
    } finally {
      if (conn) conn.release();
    }
  } 


async function doTransaction() {
  let conn;
  try {
    conn = await pool.getConnection();
    await conn.beginTransaction(); // 開始交易

    const updateStudent = 'UPDATE STUDENT SET Department_ID = ? WHERE Student_ID = ?';
    await conn.query(updateStudent, ['BA001', 'S10811003']);

    await conn.commit();
    console.log('交易成功，已提交');
  } catch (err) {
    if (conn) await conn.rollback();
    console.error('交易失敗，已回滾：', err);
  } finally {
    if (conn) conn.release();
  }
}
doTransaction();

async function basicCrud() {
    let conn;
    try {
      conn = await pool.getConnection();

      sql = 'SELECT * FROM STUDENT WHERE Department_ID = ?';
      const rows = await conn.query(sql, ['BA001']);
      console.log('查詢結果：', rows);

    } catch (err) {
        console.error('操作失敗：', err);
      } finally {
        if (conn) conn.release();
      }
    }