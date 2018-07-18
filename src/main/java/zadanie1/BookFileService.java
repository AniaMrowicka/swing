//package zadanie1;
//
//import com.google.gson.Gson;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//public class BookFileService {
//    BookDto bookDto = new BookDto();
//    File file = new File ("C:\\Users\\mrowi\\books\\bookDatabase.json");
//    public void saveBooks (List<Book> bookList)throws IOException{
//
//        bookDto.setBookD(bookList);
//        try{
//            FileOutputStream outputStream = new FileOutputStream(file, true);
//            outputStream.write(new Gson().toJson(bookDto).getBytes());
//            outputStream.close();
//        }catch (Exception e){
//            System.out.println("blad zapisu:(");
//        }
//
//    }
//    public List<Book> loadBooks ()throws IOException{
//        FileInputStream inputStream = new FileInputStream(file);
//        Scanner sc = new Scanner(inputStream);
//
//
//
//    }
//}
