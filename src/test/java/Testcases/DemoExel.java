package Testcases;

import org.testng.annotations.Test;
import utilities.ExelUtility;

public class DemoExel {

    public static void main(String[] args){

        ExelUtility.getExelInstance("dataset/data.xlsx", "Sheet1");

//        System.out.println("Row count is: " +ExelUtility.getRowCount());
//        System.out.println("Column count is: " +ExelUtility.getColumnCount());
//        System.out.println(ExelUtility.getCellDataString(0, 0));//username
//        System.out.println(ExelUtility.getCellDataString(1, 0));//username
//        System.out.println(ExelUtility.getCellDataString(2, 0));//username

        int rowCount = ExelUtility.getRowCount();
        int columnCount = ExelUtility.getColumnCount();

        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<columnCount; j++){
                System.out.print(ExelUtility.getCellDataString(i,j) +" | ");
            }
            System.out.println();
        }
    }
}
