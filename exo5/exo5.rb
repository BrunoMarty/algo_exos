mot = "beweb"  #déclaration des variables
mot.downcase!
choix=2

puts case choix  #switch pour les differentes options
when 1    #option palindrome
  deb_mot=0
  fin_mot=mot.length-1
  palindrome=1
  	while(deb_mot< fin_mot)
        if mot[deb_mot]!=mot[fin_mot]
          palindrome=0
          break
        end
        deb_mot = deb_mot +1
        fin_mot = fin_mot -1
    end
  if(palindrome==1)
    print("C'est un palindrome")
  else
    print("Ce n'est pas un palindrome")
  end
when 2      #compte le nombre de caractère alphabétique
  nb_lettre = 0
  i=0
    while i < mot.length
      if(/[a-z]/ !~ mot[i])==false  #condition qui est vrai seulemement si mot[i] est une lettre
        nb_lettre=nb_lettre +1
      end
      i = i+1
    end
  print(nb_lettre)
when 3    #remplacement d'une lettre par une autre
  remp = "z"
  val = "w"
  i=0
  while i < mot.length
    if mot[i]==val     # si on tombe sur la lettre a remplacer, alors on rentre dans le si
     mot[i]=remp       # on remplace la lettre par celle voulu
    end
    i = i +1
  end
  print(mot)
when 4  #séparer le mot
  print(mot.chars.each_slice(mot.length/2).map(&:join)) #permet de split un texte en 2 ou plus
  # print(mot.split("w").last)



end
