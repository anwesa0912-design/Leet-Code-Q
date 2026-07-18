class Solution {
    public int[] sortArray(int[] nums) {
        nums=merge(nums);
        return nums;
    }
    public int[] merge(int[]a){
        int l=a.length;
        if(l==1) return a;
        int mid=l/2;
        int [] s=merge(Arrays.copyOfRange(a,0,mid));
        int[] e=merge(Arrays.copyOfRange(a,mid,l));
        return mix(s,e);
    }
    public int[] mix(int[]f,int[]t){
        int i=0,j=0,k=0;
        int[] m=new int[f.length+t.length];
        while(i<f.length&&j<t.length){
            if(f[i]<
            t[j]){
                m[k]=f[i];
                i++;
                k++;
            }
            else{
                m[k]=t[j];
                j++;
                k++;
            }
        }
        while(i<f.length){
            m[k]=f[i];
            i++;
            k++;
        }
        while(j<t.length){
            m[k]=t[j];
            j++;
            k++;
        }
        return m;
    }
}