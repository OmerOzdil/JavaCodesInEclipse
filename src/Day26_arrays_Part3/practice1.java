package Day26_arrays_Part3;

public class practice1 {

public static void main(String[] args) {
        
        String arr[] = {"aaaa", "bbbbbbb", "jjjaaavvvaaaaaaa","dsj","sdjfjdbasdbbsddbhdbsdbh","iouhteo"};

        System.out.println(largest(arr));
        
        
        
    }
    public static String largest(String[] arr){

        int max = arr[0].length();
        
        String dummy="";
        
        for(int i=0; i<arr.length; i++){

            if(arr[i].length()>max){

                max=arr[i].length();
                
                dummy=arr[i];
            }

        }

        
        return dummy;
    } 
    
}
