package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtilities {

    public static List<List<String>> getListData(String path,String sheetName,int colombCount){

        List<List<String>> returnList=new ArrayList<>();

        FileInputStream inputStream=null;
        Workbook workbook=null;
        try {
            inputStream=new FileInputStream(path);
            workbook=WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Sheet sheet=workbook.getSheet(sheetName);
        //int countRow=sheet.getPhysicalNumberOfRows(); // ich verwende nicht, wiel es zu lange ist :)
        for (int i = 0; i <colombCount ; i++) {
        List<String>row_List=new ArrayList<>();
        Row row=sheet.getRow(i);
            for (int j = 0; j <colombCount ; j++) {
                row_List.add(row.getCell(j).toString());
            }
         returnList.add(row_List);
        }

        return  returnList;
    }

    public static void main(String[] args) {

        List<List<String>>excelReturnList = getListData("src/test/java/ApachePOI/recources/ApacheExcel2.xlsx","testCitizen",2);

            System.out.println("excelReturnList = " + excelReturnList);

    }



}
