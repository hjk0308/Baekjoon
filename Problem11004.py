import sys

n, k = map(int, sys.stdin.readline().split())

T = [int(i) for i in input().split(" ")]
T.sort()
print(T[k-1])