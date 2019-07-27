package ro.mirodone;

public class Main {

    public static void main(String[] args) {
        //test code

        EqualSidesArray equalSidesArray = new EqualSidesArray();
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {20,10,30,10,10,15,35};
        System.out.println(equalSidesArray.findEvenIndex(arr));
        System.out.println(equalSidesArray.findEvenIndex(arr1));
        System.out.println(equalSidesArray.findEvenIndex(arr2));

       EqualSidesClever equalSidesClever = new EqualSidesClever();


        System.out.println(equalSidesClever.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        System.out.println(equalSidesArray.findEvenIndex(new int[] {1, 2, 3, 4, 3, 2, 1}));


    }
}
