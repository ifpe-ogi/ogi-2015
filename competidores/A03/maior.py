N1, N2, N3, N4 = 0,0,0,0

OP1 = ""
OP2 = ""


N1 = int (raw_input())
OP1 = (raw_input())
N2 = int (raw_input())
N3 = int (raw_input())
OP2 = (raw_input())
N4 = int (raw_input())

if (OP1 == "+" and OP2 == "+"):
    if(N1 + N2) > (N3 + N4):
        print ">"
    else:
        if (N1 + N2) < (N3 + N4):
            print "<"
        else:
            print "="
elif (OP1 == '+' and OP2 == '*'):
    if(N1 + N2) > (N3 * N4):
        print ">"
    else:
        if (N1 + N2) < (N3 * N4):
            print "<"
        else:
            print "="  
elif (OP1 == '+' and OP2 == '^'):
    if(N1 + N2) > (N3 ** N4):
        print ">"
    else:
        if (N1 + N2) < (N3 ** N4):
            print "<"
        else:
            print "="  
elif (OP1 == '*' and OP2 == '+'):
    if(N1 * N2) > (N3 + N4):
        print ">"
    else:
        if (N1 * N2) < (N3 + N4):
            print "<"
        else:
            print "=" 
elif (OP1 == '*' and OP2 == '*'):
    if(N1 * N2) > (N3 * N4):
        print ">"
    else:
        if (N1 * N2) < (N3 * N4):
            print "<"
        else:
            print "=" 
elif (OP1 == '*' and OP2 == '^'):
    if(N1 * N2) > (N3 ** N4):
        print ">"
    else:
        if (N1 * N2) < (N3 ** N4):
            print "<"
        else:
            print "="
elif (OP1 == '^' and OP2 == '+'):
    if (N1 ** N2) > (N3 + N4):
        print ">"
    else:
        if (N1 ** N2) < (N3 + N4):
            print "<"
        else:
            print"="
elif (OP1 == '^' and OP2 == '*'):
    if(N1 ** N2) > (N3 * N4):
        print ">"
    else:
        if (N1 ** N2) < (N3 * N4):
            print "<"
        else:
            print "="
elif (OP1 == '^' and OP2 == '^'):
    if(N1 ** N2) > (N3 ** N4):
        print ">"
    else:
        if (N1 ** N2) < (N3 ** N4):
            print "<"
        else:
            print "="
