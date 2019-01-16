import java.util.Arrays;

public class f1 {
        int[] list=new int[10];
        public static void main(String[] args) {

            f1 l1=new f1();
            System.out.println(Arrays.toString(l1.list));
            l1.insert(42);
            System.out.println(Arrays.toString(l1.list));
        }

        private void insert(int i) {
            for(int j=0;j<list.length;j++){
                if(list[j]==0){
                    list[j]=i;
                    break;
                }
            }
        }
    }
