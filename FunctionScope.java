import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FunctionScope {

    Stack <HashMap<String, Value>> scopes = new Stack();
    //public static Value VOID = new Value(new Object());

    //Reference version
    /*
        HasScope
    */

    // final Object Value;
    
    public FunctionScope() {}

    public HashMap<String, Value> peek() 
    {
        return scopes.peek();
    }

    //whant to retiee key from top
    public Value Peek_Key(String key) 
    {
        return scopes.peek().get(key);
    }

    public void newScope()
    {
        HashMap<String, Value> memoryI= new HashMap<String, Value>();
        scopes.push(memoryI);
    }
    public void push(String s, Value v) {
        
        scopes.elementAt(scopes.size()-1).put(s,v);
         
    }
    
    //AT THE END OF FUNCTION, THIS SHULD BE CALLED
    public void pop() 
    {
        scopes.pop();
    }

    //this should replce the value of a key on determine HashMap, in case of an ':='
    public void replace(String key, Value Vtt)
    {
                scopes.peek().replace(key , Vtt);
    }

    //of you want to get a key; you should use this method
    public Value Find(String Key)
    {
                return scopes.peek().get(Key);
    }
}