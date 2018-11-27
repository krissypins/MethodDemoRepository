import java.util.ArrayList;
public class GitHubMethodPractice{

	public static void main(String[]args){

	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();

	for(int i = 1; i <= 10; i++){
		list.add(i);
		list2.add(i);
	}//close for

	combineArr(list, list2);

	}

	public static ArrayList<Integer> combineArr(ArrayList<Integer> arr, ArrayList<Integer> arr2){
		for(int i = 0; i < arr.size(); i++){
			arr.add(arr2.get(i));
		}//close for
		return(arr);
	}//close combineArr

	public static ArrayList<Integer> printOut(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}//close printOut
		return(arr);
	}//close printOut

}