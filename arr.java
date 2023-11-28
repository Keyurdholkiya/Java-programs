public class arr {
        static void display(int ...arr){
            int sum=0;
            for (int a:arr){
                sum=sum+a;
                System.out.println(sum);
            }
        }

        public static void main(String args[]){
            arr a1=new arr();
            a1.display(10,20,50,90,60);
        }
    }


