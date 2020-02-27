program HelloWorld;
var
BaT : real;
decision : boolean;
original : boolean;


begin
    writeln('Take a decision');
    writeln('True or False');
    readln(decision);
    original := decision;
    writeln('Are you sure');
    writeln('True or False');
    readln(decision);
    writeln('I am questioning your decision of ' + original );
    writeln('Are you sure');
    writeln('True or False');
    readln(decision);
    
    writeln(decision);
    if(decision=original) then
        writeln('Congratulation you manage to stay firm to your original decision of ' + original );
    else
        writeln('You are easy influenciable' );;
    

    writeln('This is test6');
end.