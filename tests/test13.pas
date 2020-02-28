program whileLoop;
var
   a: real;
   i: real;

begin
   a := 10;
   while  a < 20  do
   begin
      i:= 1+i;
      writeln(i);
      a := a + 1;
   end;
   writeln(i);
end.