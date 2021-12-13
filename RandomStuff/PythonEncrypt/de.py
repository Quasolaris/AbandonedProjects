w = 1
while w == 1:
    #asking input
    print("Insert password to decrypt:")
    i = input()
    #decrypt
    i = int(i)
    e = i-(21*3546+9825-45)
    #convertion dec to ASCII comes here
    print ("decrypted password:  ", e)
    #asking to restart
    print("Want to encrypt again? y/n")
    w2 = 1
    while w2 == 1:
          s = input()
          if s == 'y':
              print("Restarting...")
              w2 = 0
          elif s == 'n':
              w = 0
              w2 = 0
              print("Returning to menu...")
              import main
          else:
              print("Wrong input")