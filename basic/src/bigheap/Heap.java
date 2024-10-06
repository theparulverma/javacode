package bigheap;

import java.util.ArrayList;
    public class Heap {
        ArrayList<Integer> ll = new ArrayList<>();
        public void add(int item){
            ll.add(item);
            unheapify(ll.size()-1);
        }
        private void unheapify(int ci){//ci means child index
            int pi =(ci-1)/2;
            if(ll.get(pi)>ll.get(ci)){
                swap(pi,ci);
                // ci=pi; hume agar without recursion karna hotA TOh yeh likh dete .
                unheapify(pi);
            }
        }
        public void swap(int i,int j){//yaha se toh index hi aayegae na
            int ith = ll.get(i);//iss get se uss index pe jo value h voh aayegi
            int jth = ll.get(j);
            ll.set(i,jth);
            ll.set(j,ith);
        }
        public int remove(){
            //top ka data remove means jo sabse top vala root ka for this complete bt banega aur o(1)time maintain
            swap(0,ll.size()-1);
            int rv = ll.remove(ll.size()-1);//aab remove toh kar diya but it's not maintaining heap property soo for that,we have to apply down heapify method
            downheapify(0);
            return rv;
        }
        private void downheapify(int pi){
            int lci=2*pi+1;//left child index
            int rci=2*pi+2;//right child index
            int mini = pi;//mini means jo root node pe h voh minimum hona chaiye soo we will check with these 2 conditons
            if(lci<ll.size() && ll.get(lci)<ll.get(mini)){
                mini = lci;
            }
            if(rci<ll.size() && ll.get(rci)<ll.get(mini)){
                mini = rci;
            }
            if(mini!=pi){
                swap(mini,pi);
                downheapify(mini);
            }
        }
        public int size(){
            return ll.size();
        }
        public int min(){
            return ll.get(0);
        }
        public void display(){
            System.out.println(ll);
        }
    }

