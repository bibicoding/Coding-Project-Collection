def move(n, from_rod, to_rod):
    print(f"Move disk {n} from {from_rod} to {to_rod}")

def hanoi(n, from_rod, to_rod, aux_rod):
    if n == 1:
        move(1, from_rod, to_rod)
        return
    hanoi(n - 1, from_rod, aux_rod, to_rod)
    move(n, from_rod, to_rod)
    hanoi(n - 1, aux_rod, to_rod, from_rod)

if __name__ == "__main__":
    n = 3  # 可以改變此值測試不同的盤數
    hanoi(n, 'A', 'C', 'B')