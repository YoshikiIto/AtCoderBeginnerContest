import sys


def calc(arg_list):

    a = arg_list[0]
    b = arg_list[1]
    c = arg_list[2]
    x = arg_list[3]

    result = []

    for a_i in range(0, a + 1):
        for b_i in range(0, b + 1):
            for c_i in range(0, c + 1):
                if a_i * 500 + b_i * 100 + c_i * 50 == x:
                    result.append((a_i, b_i, c_i))
    return result


if __name__ == '__main__':
    args = []
    for arg in sys.stdin:
        try:
            args.append(int(arg))
        except EOFError:
            break

    print(len(calc(args)))
