class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<>();
        int k = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(hs.add(nums[i]))
            {
                nums[k] = nums[i];
                k++;
            }
        }
       
        return k;   

        //   HashSet<Integer> hset=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     hset.add(nums[i]);
        // }
        // int k=0;

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(hset.contains(nums[i]))
        //     {
        //         nums[k]=nums[i];
        //         k++;
        //         hset.remove(nums[i]);
        //     }  
        // }
        // return k;

    }
}