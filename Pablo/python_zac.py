meno = input("Ako sa volas?: ")
vek = input("Kolko mas rokov?: ")
cvek = int(vek)



print("tvoje meno je", meno ,)
print("mas", cvek ,"rokov")

print("volam sa {} a mam {} rokov".format(meno, cvek))

if cvek < 10:
    print("kys mas malo rokov")
