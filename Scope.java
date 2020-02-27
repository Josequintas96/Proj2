import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Scope {

    Stack <HashMap<String, Value>> Scope = new Stack();
    int size =0;
    //public static Value VOID = new Value(new Object());

    //Reference version
    /*
        HasScope
    */

    // final Object Value;
    
    public Scope(HashMap<String, Value> memory) {
        this.Scope.push(memory);
    }

    public HashMap<String, Value> peek() 
    {
        return Scope.peek();
    }

    //whant to retiee key from top
    public Value Peek_Key(String key) 
    {
        return Scope.peek().get(key);
    }

    public void push(HashMap<String, Value> TT ) {
         Scope.push(TT);
         size++;
    }
    
    //AT THE END OF FUNCTION, THIS SHULD BE CALLED
    public void pop() 
    {
        Scope.pop();
        size++;
    }

    //this should replce the value of a key on determine HashMap, in case of an ':='
    public void replace(String key, Value Vtt)
    {
        Stack<HashMap<String, Value>> restore = new Stack();
        boolean exist = false;
        int run =0;

        while(run <= size && exist == false)
        {
            if(Scope.peek().get(key) != null)
            {
                Scope.peek().replace(key , Vtt);
                exist = true;
            }
            else
            {
                restore.push(Scope.pop());
                run++;
            }
        }

        while(run!=0)
        {
            Scope.push(restore.pop());
            run--;
        }
    }

    //of you want to get a key; you should use this method
    public Value Find(String Key)
    {
        Value returnH = null;
        Stack<HashMap<String, Value>> restore = new Stack();
        boolean exist = false;
        int run =0;

        while(run <= size && exist == false)
        {
            if(Scope.peek().get(Key) != null)
            {
                returnH = Scope.peek().get(Key);
                exist = true;
            }
            else
            {
                restore.push(Scope.pop());
                run++;
            }
        }

        while(run!=0)
        {
            Scope.push(restore.pop());
            run--;
        }

        return returnH;
    }
}