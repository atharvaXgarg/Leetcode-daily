class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        // use toc logic
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<nums.length;i++){
          s1.append(nums[i]);
        }
        int currentState=0;
        ArrayList<Boolean> arr=new ArrayList<>();
        
              for (int i=0;i<s1.length();i++) {
                char c=s1.charAt(i);
            switch (c){
                case '0':
                    if(currentState==0){
                        break;
                    }
                    else if(currentState==1){
                        currentState=2;
                    } else if (currentState==2) {
                        currentState=4;
                    } else if (currentState==3) {
                        currentState=1;
                    } else if (currentState==4) {
                        currentState=3;
                    }
                    break;
                case '1':
                    if(currentState==0){
                        currentState=1;
                    }
                    else if(currentState==1){
                        currentState=3;
                    }else if(currentState==2){
                        currentState=0;
                    }else if(currentState==3){
                        currentState=2;
                    }else if(currentState==4){
                        currentState=4;
                    }break;
            }
            arr.add(currentState==0);

        }
        
        return arr;

    }
}
