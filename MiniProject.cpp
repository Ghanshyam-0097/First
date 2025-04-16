#include<iostream>
using namespace std;

class Person
{
	protected:
		string name;
		int age;
	public:
		Person(string n, int a)	: name(n), age(a) {}
		void showDetails() const
		{
			cout << "Name : " << "\nAge : " << age << endl;
		}
};

class Account
{
	protected:
		int accountNumber;
		double balance;
	public:
		Account(int accNum, double bal) : accountNumber(accNum), balance(bal) {}
		void deposit(double amount)
		{
			balance += amount;
			cout << "Deposited : Rs. " << amount << "\nNew Balance : Rs. " << balance << endl;
		}
		void withdraw(double amount)
		{
			if(amount > balance)
			{
				cout << "Insufficient Balance " << endl;
			}
			else
			{
				balance -= amount;
				cout << "Withdrawn : Rs. " << amount << "\nRemaining Balance : Rs. " << balance << endl;
			}
		}
		void showBalance() const
		{
			cout << "Account Number : " << accountNumber << "\nBalance : " << balance << endl;
		}
};

class Customer : public Person, public Account
{
	public:
		Customer(string n, int a, int accNum, double bal) : Person(n,a), Account(accNum, bal) {}	
};

class Bank
{
	Customer * customer;
	public:
		Bank() : customer(nullptr) {}
		void createAccount(string name, int age, int accNum, double initialDeposit)
		{
			if(customer != nullptr)
			{
				cout << "Account already exists! " << endl;
			}
			else
			{
				customer = new customer(name, age, accNum, initialDeposit)
				cout << "Acount created successfully! " << endl;
			}
		}
		void deleteAccount()
		{
			if(customer != nullptr)
			{
				delete customer;
				customer = nullptr;
				cout << "Account deleted successfully! " << endl;
			}
			else
			{
				cout << "No account exists! " << endl;
			}
		}
		void showDetails() const
		{
			if(customer != nullptr)
			{
				customer->showDetails();
				customer->showBalance();
			}
			else
			{
				cout << "No account to display " << endl;
			}
		}
		void depositMoney(double amount)
		{
			if(customer != nullptr)
			{
				customer->deposit(amount);
			}
			else
			{
				cout << "No account exists " << endl;
			}
		}
		void withdrawMoney(double amount)
		{
			if(customer != nullptr)
			{
				customer->withdraw(amount);
			}
			else
			{
				cout << "No account exists " << endl;
			}
		}
		~Bank() 
		{
			delete customer;
		}
};

int main()
{
	Bank bank;
    int choice;
    string name;
    int age, accNum;
    double amount;

    while (1) {
        cout << "\n=== Banking System Menu ===" << endl;
        cout << "1. Create Account\n2. Delete Account\n3. Show Account Details\n4. Deposit Money\n5. Withdraw Money\n6. Exit" << endl;
        cout << "Choose an option: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter Name: ";
                cin >> name;
                cout << "Enter Age: ";
                cin >> age;
                cout << "Enter Account Number: ";
                cin >> accNum;
                cout << "Enter Initial Deposit Amount: ";
                cin >> amount;
                bank.createAccount(name, age, accNum, amount);
                break;
            case 2:
                bank.deleteAccount();
                break;
            case 3:
                bank.showDetails();
                break;
            case 4:
                cout << "Enter Amount to Deposit: ";
                cin >> amount;
                bank.depositMoney(amount);
                break;
            case 5:
                cout << "Enter Amount to Withdraw: ";
                cin >> amount;
                bank.withdrawMoney(amount);
                break;
            case 6:
                cout << "Exiting..." << endl;
                return 0;
            default:
                cout << "Invalid choice! Please try again." << endl;
        }
    }

    return 0;
}