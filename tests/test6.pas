program HelloWorld;
var
BaT : real;
decision : boolean;
original : boolean;


begin
    decision:= true;
    original:= false;
    writeln('decision' + decision);
    writeln('original' + original);
    if (decision=original) then writeln('Congratulation you manage to stay firm to your original decision of ' + original ) else
        writeln('You are easy influenciable' );
    

    writeln('This is test6');
end.