public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int newnums[] = new int[size];
        int element = 0;
        int flag = 0;
        while (element != size) {
            for (int i = element + 1; i < size; i++) {
                if (nums[i] > nums[element]) {
                    newnums[element] = nums[i];
                    if (nums[i] == 0)
                        flag = 1;
                    break;
                }
            }

            if (newnums[element] == 0) {
                for (int j = 0; j < element; j++) {
                    if (nums[j] > nums[element]) {
                        newnums[element] = nums[j];
                        if (nums[j] == 0)
                            flag = 1;
                        break;
                    }
                }
            }
            if (newnums[element] == 0 && flag == 0)
                newnums[element] = -1;
            flag = 0;
            element++;
        }
        return newnums;
    }
}
