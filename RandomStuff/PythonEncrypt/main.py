#asking what to do
print("What do you wnat to do?")
print("1        Encrypt Password")
print("2        Decrypt Password")
#asking input
w = 1
while w == 1:
    try:
        i = input()
        i = int(i)
        if i == 1:
            print("Loading encrypttool...")
            import en
            w = 0
        elif i == 2:
            print("Loading decrypttool...")
            import de
            w = 0
        else:
            print("Wrong input")
    except:
        print("Wrong input")
        
    

