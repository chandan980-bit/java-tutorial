import java.util.*;
public class Array {
    //1. create an array
    public static void CreateArray(int marks[]){
        System.out.println("MATH = "+marks[1]);
        System.out.println("MATH = "+marks[1]);
    }
        
    //2. Length of the array
    public static void Length(){
        int marks[] = new int[50];
        int shape[] = {1,2,3,4,10,23,54};
        System.out.println("Length of the marks Array is : "+marks.length);        
        System.out.println("Length of the shape Array is : "+shape.length);        
    }
            
    //3. Passing arrays as Argument
    public static void Grow(int marks[]){
        for(int i = 0 ; i < marks.length ; i++){
            marks[i] = marks[i] + 10;
        }
    }
    // Write the Array
    public static void CallArray(int marks[]){
        System.out.print("The array is : ");
        for(int i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i]+ " ");
        }
    }

    //4. Linear Search in an Array
    public static int LinearSearch(int marks[]){
        int key = 15;
        for(int i=0;i<marks.length;i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }

    //5. Largest number in an Array
    public static void LargeNum(int marks[]){
        int max =  Integer.MIN_VALUE;
        for(int i = 0 ; i < marks.length ; i++){
           if(max < marks[i]){
                max = marks[i];
           }
        }
        System.out.println("Largest number in the array is : " + max);
    }

    //6. Smallest number in array
    public static void SmallNum(int marks[]){
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<marks.length;i++){
            if(min > marks[i]){
                min = marks[i];
            }
        }
        System.out.println("Smallest number in an Array is : "+min);
    }

    //7. Binary Search in Array
    public static int Binary(int marks[]){
        int key = 20;
        int start =0;
        int end = marks.length-1;
        for(int i = 0;i<marks.length;i++){
            int mid =(start + end) / 2;
            if(key == marks[mid]){
                return mid;
            }
            else if(key > marks[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    // 8. Reverse of an Array
    public static void Reverse(int marks[]){
        int start = 0;
        int end = marks.length-1;
        while(start < end){
            int rem = marks[end];
            marks[end] = marks[start];
            marks[start] = rem;
            start++;
            end--;
        }
    }

    // 9.Pairs in an Array
    public static void Pairs(int marks[]){
        System.out.println("Pairs of an Array are : ");
        for(int i = 0; i < marks.length ; i++){
            for(int j = i+1;j < marks.length ; j++){
                System.out.print(marks[i]+" "+marks[j] + " , ");
            }
            System.out.println();
        }
    }

    //10. Total No of Pairs in An Array
    public static void Total(int marks[]){
        int count = 0;
        for(int i = 0; i < marks.length ; i++){
            for(int j = i+1;j < marks.length ; j++){
                count++;
            }
        }
        System.out.println("Total Pairs in an Array is : "+count);
    }

    // 11.Print SubArray
    public static void SubArray(int marks[]){
        System.out.println("Write all subArray of an Array: ");
        for(int i = 0 ; i < marks.length ; i++){
            for(int j = 0 ; j < marks.length ; j++){
                for(int k = i ;k <= j ; k++){
                    System.out.print(marks[k] + " ");
                }
                 System.out.println();
            }
            System.out.println();
        }
    }

    //12. Print Sum of SubArray
    public static void SumOfSubArray(int marks[]){
        for(int i = 0 ; i < marks.length ; i++){
            for(int j = 0 ; j < marks.length ; j++){
                int sum = 0; 
                for(int k = i ;k <= j ; k++){
                    System.out.print(marks[k]+" + ");
                    sum = sum + marks[k];
                } 
                System.out.print(" = "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    //13. Max Sub_Array Sum
    public static void MaxSubArray(int marks[]){
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < marks.length ; i++){
            for(int j = 0 ; j < marks.length ; j++){
                int sum = 0; 
                for(int k = i ;k <= j ; k++){
                    System.out.print(marks[k]+" + ");
                    sum = sum + marks[k];
                    } 
                if(max_sum < sum){
                    max_sum = sum;
                }
                System.out.print(" = "+sum);
                System.out.println();
            }
            System.out.println();
        }    
        System.out.println(" Max SubArray is : " + max_sum);
    }  
    
    //14. Prefix Sum
    public static void PrefixSum(int marks[]){
        int prefix[]= new int[marks.length];
        prefix[0] = marks[0];
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < marks.length;i++){
            prefix[i] = prefix[i-1]+ marks[i];
        }
        for(int i = 0 ; i < marks.length;i++){
            for(int j = i ; j < marks.length ; j++){
                sum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(max_sum < sum){
                    max_sum = sum;
                }
            }
        }
        System.out.println("The maximum sum is : "+max_sum);
    }

    // 15.Maxsum Using kadan's law
    public static void Kadan(int marks[]){
        
    }
    public static void main(String args[]){
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        CreateArray(marks);
        Length();
        // Grow(marks);
        CallArray(marks);
        System.out.println(LinearSearch(marks));
        System.out.println();
        LargeNum(marks);
        SmallNum(marks);
        System.out.println();
        int a =Binary(marks);
        if(a == -1){
            System.out.println("The Given Number is Not Found in An Array ");
        }
        else{
            System.out.println("The number is Found in the index : " + a);
        }
        System.out.println();
        Reverse(marks);
        CallArray(marks);
        System.out.println();
        Pairs(marks);
        System.out.println();
        Total(marks);
        System.out.println();
        SubArray(marks);
        System.out.println();
        SumOfSubArray(marks);
        System.out.println();
        MaxSubArray(marks);
        System.out.println();
        PrefixSum(marks);
        System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();

    }
}
