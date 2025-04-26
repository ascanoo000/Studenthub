import math

def circle():
    radius = float(input("請輸入圓的半徑:"))
    area = math.pi * radius**2
    circumference = 2 * math.pi * radius
    print(f"圓面積:{area:.2f}")
    print(f"圓周長:{circumference:.2f}")
circle()