package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFavNum {

		 public static void main(String[] args){
		        List<Integer> faveNums = new ArrayList<>();

		        faveNums.add(10);
		        faveNums.add(1355417);
		        faveNums.add(63);

		        for (int i : faveNums){
		            System.out.println(i);
		        }
		    }
		}