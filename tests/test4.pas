program HelloWorld;
var
alta : real;
BaT : real;
Drag : real;
(*There is a cooment here*)
connecr : boolean;

begin
    writeln('This is the value of BaT ' + BaT);
    writeln('This is the value of alta ' + alta);
    alta:=ln(1) + 3;
    (*There is a cooment here*)
    BaT:=Cos(0);
    writeln('This is the value of BaT ' + BaT);
    writeln('This is the value of alta ' + alta);
    (*There is a cooment here*)
    Drag := BaT - alta;
    writeln('This is the value of alta ' + Drag);
    Drag := dopower(Drag, Drag); 
    writeln('This is the final result of Drag ' + Drag);
    writeln('This is test4');
end.