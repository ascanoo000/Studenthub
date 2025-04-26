// crudExample.js
const pool = require('./db');

async function basicCrud() {
  let conn;
  try {
    conn = await pool.getConnection();

    const studentId = 'S10810001';
    const newName='王明小';
    
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

basicCrud();
