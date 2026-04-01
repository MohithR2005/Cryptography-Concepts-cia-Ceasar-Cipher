# -------- Hash Function --------
def generate_key(text):
    total = 0

    for ch in text:
        total += ord(ch)

    return total % 26


# -------- Encryption --------
def encrypt(text, key):
    result = ""

    for ch in text:
        if ch.isupper():
            result += chr((ord(ch) - ord('A') + key) % 26 + ord('A'))
        elif ch.islower():
            result += chr((ord(ch) - ord('a') + key) % 26 + ord('a'))
        else:
            result += ch

    return result


# -------- Decryption --------
def decrypt(text, key):
    result = ""

    for ch in text:
        if ch.isupper():
            result += chr((ord(ch) - ord('A') - key + 26) % 26 + ord('A'))
        elif ch.islower():
            result += chr((ord(ch) - ord('a') - key + 26) % 26 + ord('a'))
        else:
            result += ch

    return result


# -------- Main --------
def main():
    print("1. Encryption")
    print("2. Decryption")
    choice = int(input("Enter choice: "))

    if choice == 1:
        plain_text = input("Enter Plain Text: ")

        key = generate_key(plain_text)
        print("Generated Key (Hash):", key)

        cipher_text = encrypt(plain_text, key)
        print("Encrypted Text:", cipher_text)

        print("NOTE: Save this key for decryption!")

    elif choice == 2:
        cipher = input("Enter Cipher Text: ")
        user_key = int(input("Enter Key used during encryption: "))

        decrypted = decrypt(cipher, user_key)
        print("Decrypted Text:", decrypted)

    else:
        print("Invalid choice!")


if __name__ == "__main__":
    main()
