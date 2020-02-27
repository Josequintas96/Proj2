program exFunction;
var
    a: real;
    b: real;

function max (num1 , num2: real) : real;
var
   result: real;

begin
    writeln('3hi');
   if (num1 > 2) then
      result := num1
   else
      result := 2;
      writeln('4hi');
   max := result;
end;

begin
    writeln('1hi');
   a := 100;
   writeln('2hi');
   a := max(a, b);
   
   writeln( 'Max value is : ');
end.