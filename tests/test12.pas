program exFunction;
var
    a: real;
    b: real;

function max (num1 , num2: real) : real;
var
   result: real;
begin
writeln(num1, 'num1');
writeln(num2, 'num2');
   if  num1>num2 then result := num1 else
        result := num2;
      
      writeln('finish function before', result);
   max := result;
   writeln('finish function');
end;

begin
    writeln('1hi');
   a := 100;
   writeln('2hi');
   a := max(a, b);
   
   writeln( 'Max value is : ', a);
end.