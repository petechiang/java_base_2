package com.io;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
public class Shili_input2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("d:\\shili.xlsx");
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		
		
		
		
		Map map=new HashMap<>();
		//定义要读取的sheet
		XSSFSheet sheet=workbook_in.getSheet("Sheet1");
		//获取sheet中有多少行数据
		int rows=sheet.getLastRowNum();
		//System.out.println(rows);
		if (rows==0) {
			throw new RuntimeException("表格中没有数据...");
		}
		XSSFRow rowi=null;//行对象
		Iterator<Cell> cell_jihe=null;  //列集合对象
		ArrayList list=null;   //每行数据集合对象
		for (int i = 1; i <=rows; i++) {
			rowi=sheet.getRow(i);
			cell_jihe=rowi.cellIterator();
			list=new ArrayList();   //每行数据集合对象
			while (cell_jihe.hasNext()) {
				Cell cell = (Cell) cell_jihe.next();
				if (cell.getCellType()==CellType.NUMERIC) {
					list.add(cell.getNumericCellValue());
				}else if(cell.getCellType()==CellType.STRING) {
					list.add(cell.getStringCellValue());
				}
				
			}
			map.put(list.get(3), list);
		}
		System.out.println(map);
		
		FileInputStream fin2=new FileInputStream("d:\\18rj1.xlsx");
		XSSFWorkbook workbook_in2=new XSSFWorkbook(fin2);
		//定义要读取的sheet
		XSSFSheet sheet2=workbook_in2.getSheet("Sheet1");
				//获取sheet中有多少行数据
		int rows2=sheet2.getLastRowNum();
		//System.out.println(rows);
		if (rows2==0) {
					throw new RuntimeException("表格中没有数据...");
		}
				XSSFRow rowi2=null;//行对象
				
		for (int i = 1; i <=rows2; i++) {
			rowi2=sheet2.getRow(i);
			
			String xuehao=rowi2.getCell(3).getStringCellValue();//n表示第几列
		    ArrayList list3=(ArrayList)map.get(xuehao);
		    System.out.println(list3);
		    if (list3!=null) {
		    	rowi2.createCell(15, CellType.STRING).setCellValue(list3.get(11).toString());//m表示第几列
			
		    	rowi2.createCell(16, CellType.STRING).setCellValue(list3.get(12).toString());//m表示第几列
			}
				
			}
		
		
		
		
		
		FileOutputStream fout=new FileOutputStream("d:\\18rj1.xlsx");
		workbook_in2.write(fout);
		fout.close();
	}

}
