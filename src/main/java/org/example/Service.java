package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/27/2024 *Time:8:03 PM
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;


public class Service {
    public static void addComment(){
        XSSFWorkbook xssfSheets = new XSSFWorkbook();
        XSSFSheet sheet = xssfSheets.createSheet("list");

        XSSFCellStyle cellStyle = xssfSheets.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell.setCellValue("name: ");
        cell.setCellStyle(cellStyle);

        XSSFCell cell1 = row.createCell(1, Cell.CELL_TYPE_STRING);
        cell1.setCellValue("comment: ");
        cell1.setCellStyle(cellStyle);

        int i = 1;

        for (Comment user : AllInfo.comments) {
            XSSFRow row1 = sheet.createRow(i++);
            row1.createCell(0,Cell.CELL_TYPE_STRING).setCellValue(user.getName());
            row1.createCell(1,Cell.CELL_TYPE_STRING).setCellValue(user.getComment());
        }

        try {
            xssfSheets.write(new FileOutputStream("C:\\Users\\Asus\\Desktop\\Java\\CtranceServer\\Comments.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addUser(){
        XSSFWorkbook xssfSheets = new XSSFWorkbook();
        XSSFSheet sheet = xssfSheets.createSheet("list");

        XSSFCellStyle cellStyle = xssfSheets.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell.setCellValue("firstname: ");
        cell.setCellStyle(cellStyle);

        XSSFCell cell1 = row.createCell(1, Cell.CELL_TYPE_STRING);
        cell1.setCellValue("phoneNumber: ");
        cell1.setCellStyle(cellStyle);

        XSSFCell cell2 = row.createCell(2, Cell.CELL_TYPE_STRING);
        cell2.setCellValue("currentLanguage: ");
        cell2.setCellStyle(cellStyle);

        int i = 1;

        for (User user : DB.users) {
            XSSFRow row1 = sheet.createRow(i++);
            row1.createCell(0,Cell.CELL_TYPE_STRING).setCellValue(user.getFirstName());
            row1.createCell(1,Cell.CELL_TYPE_STRING).setCellValue(user.getPhoneNumber());
            row1.createCell(2,Cell.CELL_TYPE_STRING).setCellValue(user.getCurrentLanguage());
        }

        try {
            xssfSheets.write(new FileOutputStream("C:\\Users\\Asus\\Desktop\\Java\\CtranceServer\\Users.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void write(){
        XSSFWorkbook xssfSheets = new XSSFWorkbook();
        XSSFSheet sheet = xssfSheets.createSheet("list");

        XSSFCellStyle cellStyle = xssfSheets.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell.setCellValue("firstname: ");
        cell.setCellStyle(cellStyle);

        XSSFCell cell1 = row.createCell(1, Cell.CELL_TYPE_STRING);
        cell1.setCellValue("chatId: ");
        cell1.setCellStyle(cellStyle);

        XSSFCell cell2 = row.createCell(2, Cell.CELL_TYPE_STRING);
        cell2.setCellValue("text: ");
        cell2.setCellStyle(cellStyle);
        int i = 1;

        for (User2 user : AllInfo.user2s) {
            XSSFRow row1 = sheet.createRow(i++);
            row1.createCell(0,Cell.CELL_TYPE_STRING).setCellValue(user.getName());
            row1.createCell(1,Cell.CELL_TYPE_STRING).setCellValue(user.getChatId());
            row1.createCell(2,Cell.CELL_TYPE_STRING).setCellValue(user.getText());
        }

        try {
            xssfSheets.write(new FileOutputStream("C:\\Users\\Asus\\Desktop\\Java\\CtranceServer\\AllInfoAboutUsers.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
