t=int(input())
for _ in range(t):
    dsa,toc,dm=map(int,input().split())
    dsa1,toc1,dm1=map(int,input().split())
    if (dsa+toc+dm)>(dsa1+toc1+dm1):
        print("DRAGON")
    elif (dsa+toc+dm)<(dsa1+toc1+dm1):
        print("SLOTH")
    elif (dsa+toc+dm)==(dsa1+toc1+dm1):
        if dsa>dsa1:
            print("DRAGON")
        elif dsa<dsa1:
            print("SLOTH")
        elif dsa==dsa1:
            if toc>toc1:
                print("DRAGON")
            elif toc<toc1:
                print("SLOTH")
            elif toc==toc1:
                if dm>dm1:
                    print("DRAGON")
                elif dm<dm1:
                    print("SLOTH")
                elif dm==dm1:
                    print("TIE")
