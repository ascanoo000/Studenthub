def male_female_percentages ():
   males= int(input("請輸入班級中的男性人數:"))
   females=int(input("請輸入班級中的女性人數:"))
   total_students = males + females 
   if total_students == 0:
      print("班級中沒有學生。")

   else:
     male = (males / total_students)* 100 
     female = (females / total_students) * 100
     print(f"男性比例:{male :.2f}%")
     print(f"女性比例:{female:.2f}%")

male_female_percentages()