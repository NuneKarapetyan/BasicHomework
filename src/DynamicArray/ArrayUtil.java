package DynamicArray;

public class ArrayUtil {
    //վերադարձնել փոքրագույն  էլեմենտը
    public int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //    վերադարձնել փոքրագույն  էլեմենտի ինդեքսը
    public int minElementIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;

            }
        }
        return minIndex;
    }

    //       գտնել մեծագույն էլէմենտը
    public int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    //    վերադարձնել փոքրագույն  էլեմենտի ինդեքսը
    public int maxElementIndex(int[] arr) {
        int max = arr[0];
        int maxIndex =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return maxIndex;

    }


    //        հաշվել տրված մասիվի էլեմենտների գումարը և  վերադարձննել
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //    վերադարձնել տրված զանգվածի էլեմենտների գումարի միջինը
    public int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / 2;
    }

    //    վերադարձնել տրված զագվածի դրական էլեմենտների արտադրյալը
    public int product(int [] arr){
        int multiplication=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                multiplication*=arr[i];
            }
        }
        return multiplication;
    }

    //  վերադարձնել կենտ ինդեքս ունեցող էլեմենտների արտադրյալը
    public  int productOfOddIndex(int [] arr){
        int productOfOddIndex= 1;
        for (int i = 1; i < arr.length; i+=2) {
            productOfOddIndex*=arr[i];
        }
        return productOfOddIndex;
    }

//    վերադարձնել զանգված,  որը  կազմված կլինի տրված  զանգվածի զույգ էլեմենտներից
//    public int[] evenNumbers(int [] arr){
//
//    }

    //  վերադարձնել զանգված,  որը  կազմված կլինի տրված  զանգվածի կենտ ինդեքս ունեցող էլեմենտներից
//    public int[] oddIndexNumbers(int [] arr){
//
//    }

}
