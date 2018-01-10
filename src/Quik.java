class Quick{

        public static void sort(Individual arr[],int low,int high,Individual[] la)
        {
                int l=low;
                int h=high;
                Individual povit=arr[low];

                while(l<h)
                {
                        while(l<h&&arr[h].fitness>=povit.fitness)
                                h--;
                        if(l<h){
                                Individual temp=arr[h];
                                arr[h]=arr[l];
                                arr[l]=temp;
                                l++;
                        }

                        while(l<h&&arr[l].fitness<=povit.fitness)
                                l++;

                        if(l<h){
                                Individual temp=arr[h];
                                arr[h]=arr[l];
                                arr[l]=temp;
                                h--;
                        }
                }
                la[l]=povit;

                if(l>low)sort(arr,low,l-1,la);
                if(h<high)sort(arr,l+1,high,la);
        }
        }