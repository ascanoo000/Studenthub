import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteRandomNumbers{
public static void main(String[] args) {
try {


File file = new File("Exercise12.15.txt");

// if file does'nt exists, then create it
if (!file.exists()) {
file.createNewFile();
}

FileWriter fw = new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);

Random rand = new Random();
int max=100;
int min=1;

System.out.println("Generating Random numbers");
for(int i=1;i<=100;i++) {

int randomNum = rand.nextInt((max - min) + 1) + min;
bw.write(randomNum+" ");

}
System.out.println("Writing Random numbers to Exercise12.15.txt is completed");

bw.close();


//Read data back from file
System.out.println("Reading data back from file:");
String sCurrentLine;

BufferedReader br = new BufferedReader(new FileReader("Exercise12.15.txt"));

int data[] = new int[100];
int j=0;
while ((sCurrentLine = br.readLine()) != null) {
String lineData[] = sCurrentLine.split(" ");
for(int i=0;i<lineData.length;i++) {
data[j] = Integer.parseInt(lineData[i]);
j++;
}

}
br.close();

//Sort data in increasing order using bubble sort
for(int i=0;i<j-1;i++) {
for(int k=i+1;k<j;k++) {
if(data[i]>data[k]) {
int temp = data[i];
data[i] = data[k];
data[k] = temp;
}
}
}

//Finally print data
System.out.println("File data in increasing order");
for(int i=0;i<j;i++) {

System.out.print(data[i]+" ");
if((i+1)%5==0) {
System.out.print("\n");
}
}
} catch (IOException e) {
e.printStackTrace();
}
}
}