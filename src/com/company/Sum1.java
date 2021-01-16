package com.company;
import java.util.HashMap;
import java.util.Map;

public class Sum1
{
    boolean MySum1(int[] array)
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(array.length == 4)
        {
            for (int index = 0; index < array.length; index++)
            {
                Integer total = map.get(array[index]);
                int count;
                if (total == null)
                {
                    count = 1;
                }
                else
                {
                    count = total + 1;
                    if (count >= 3)
                    {
                        return true;
                    }
                }
                map.put(array[index], count);
            }
        }
        else
        {
            return false;
        }
        return false;
    }
}