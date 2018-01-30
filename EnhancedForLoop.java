import java.util.ArrayList;

public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        /**
         * 4 5 1 2 3 8
         */

        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        /**
         * 4 5 1 2 3 8
         */        

         // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        /**
         * 5 6 2 3 4 9
         */
        
        // Ex. 4
        Pet[] pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }

        meanTest();
    }
        

        /********** Your turn **********/
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        
        public static double mean(double[] nums) {
            double sum = 0;
            for(double n : nums) {
                sum += n;
            }
            return sum / nums.length;
        }

        public static void meanTest() {
            System.out.println(mean(new double[] {3.52, 8.42, 3.79, 9.25}));
        }
        

        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.



        
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.




        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        
        
        

        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        
        
        
        
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        
        
        
    
}