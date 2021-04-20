package UTS_ASD_2;

public class SortingDanSearching_No1 {

	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	public static void BubbleSort(int[] Data) {
		System.out.println("After Bubble Sort : ");
		int i = 1, j, n = Data.length, temp;
		while (i < n) {
			j = n -1;
			while (j >= 1) {
				if (Data[j -1] > Data[j]) {
					temp = Data[j];
					Data[j] = Data[j -1];
					Data[j -1] = temp;
				}
				j = j - 1;
			}
			i = i + 1;
		}
	}
	
	public static void show(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		System.out.println("SORTING (BUBBLE SORT) AND SEARCHING (BINARY SEARCH) PROGRAM !!!" + "\n" + "****************************************************************");
		System.out.println("Before Bubble Sort : ");
		int Data[] = {3, 10, 4, 2, 8, 13};
		int cari = 8;
	    int LastIndex = Data.length - 1;
	    int FirstIndex = 0;
	    int flag = 0;
	    int point = 0;
		
		SortingDanSearching_No1.show(Data);
		SortingDanSearching_No1.BubbleSort(Data);
		SortingDanSearching_No1.show(Data);
		
		System.out.print("Data Search = ");
        System.out.println(cari);
                
        while((FirstIndex <= LastIndex) && (flag == 0)){
            point = (LastIndex + FirstIndex) / 2;
            System.out.println("Index Point : "+ point);
            
            if(Data[point] == cari){
                flag += 1;
                System.out.println("Data "+ cari +" telah ditemukan pada index ke- "+ point);
            }
            
            else if(cari < Data[point]){
                    System.out.println("Searching on Left Side....");
                    LastIndex = point - 1;
         
            }
            else {
                    System.out.println("Searching on Right Side....");
                    FirstIndex = point + 1;
   
                }
               
            }
        
         if(flag == 1){
            System.out.println("Data "+ cari +" telah ditemukan pada index ke- "+ point + " baris ke- "+ (point + 1));
             System.out.println("Alert : Data Was found!");
        } else {
            System.out.println("Alert : Data Not Found!!!");
     
        }
         System.out.println("");
		profil();

	}

}
