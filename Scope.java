import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.util.Pair;

class Scope {

    Stack <Pair< HashMap<String, Value>, Integer>> scopes = new Stack();
    //public static Value VOID = new Value(new Object());

    //Reference version
    /*
        HasScope
    */

    // final Object Value;
    
    public Scope() {
        
        HashMap<String, Value> memory = new HashMap<String, Value>();
        Pair < HashMap<String, Value>, Integer> p = new Pair(memory,0);
        scopes.push(p);
    }
    public HashMap<String, Value> peek() 
    {
        return scopes.peek().getKey();
    }

    //whant to retiee key from top
    public Value Peek_Key(String key) 
    {
        return scopes.peek().getKey().get(key);
    }

    public void newScope(int t)
    {
        HashMap<String, Value> memoryI= new HashMap<String, Value>();
        Pair < HashMap<String, Value>, Integer> p = new Pair(memoryI,t);
        scopes.push(p);
    }
    public void push(String s, Value v) {
        
        scopes.elementAt(scopes.size()-1).getKey().put(s,v);
         
    }
    
    //AT THE END OF FUNCTION, THIS SHULD BE CALLED
    public void pop() 
    {
        scopes.pop();
    }

    //this should replce the value of a key on determine HashMap, in case of an ':='
    public void replace(String key, Value Vtt)
    {
        if(scopes.peek().getValue() == 0)
        {
            Stack<Pair< HashMap<String, Value>, Integer>> restore = new Stack();
            boolean exist = false;
            int run =0;

            while(run <= scopes.size() && exist == false)
            {
                if(scopes.peek().getKey().get(key) != null)
                {
                    scopes.peek().getKey().replace(key , Vtt);
                    exist = true;
                }
                else
                {
                    restore.push(scopes.pop());
                    run++;
                }
            }

            while(run!=0)
            {
                scopes.push(restore.pop());
                run--;
            }
        }
        else
        scopes.peek().getKey().replace(key , Vtt);
    }

    //of you want to get a key; you should use this method
    public Value Find(String Key)
    {
        if(scopes.peek().getValue() == 0)
        {
            Value returnH = null;
            Stack<Pair< HashMap<String, Value>, Integer>> restore = new Stack();
            boolean exist = false;
            int run =0;

            while(run <= scopes.size() && exist == false)
            {
                if(scopes.peek().getKey().get(Key) != null)
                {
                    returnH = scopes.peek().getKey().get(Key);
                    exist = true;
                }
                else
                {
                    restore.push(scopes.pop());
                    run++;
                }
            }

            while(run!=0)
            {
                scopes.push(restore.pop());
                run--;
            }

            return returnH;
        }
        else
        {
            return scopes.peek().getKey().get(Key);
        }
    }
}