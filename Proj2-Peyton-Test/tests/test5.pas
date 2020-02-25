program HelloWorld;
var
length : real;
weigth : real;
height : real;
Volume : real;

begin
    writeln('Let build a pyramid');
    writeln('Please insert the length and weight');
    readln(length, weigth);
    writeln('Now insert the height ');
    readln(height);
    Volume:=(length * height * weigth)/3;

    
    writeln('The Volume of your Pyramid is ' + Volume);
    writeln('This is test5');
end.