def hanoi(n, from_rod, through_rod, to_rod):
    if n > 0:
        hanoi(n - 1, from_rod, to_rod, through_rod)
        print(f"將{n}號圓盤從柱子{from_rod}移到柱子{to_rod}")
        hanoi(n - 1, through_rod, from_rod, to_rod)

if __name__ == "__main__":
    hanoi(3, 'A', 'B', 'C')
   