# 📌 Princípios SOLID em Desenvolvimento de Software

Os princípios **SOLID** são um conjunto de diretrizes para escrever código **limpo, modular e escalável**. Eles foram observados definidos no inicio dos anos 2000 por **Robert C. Martin (Uncle Bob)**, eles ajudam a evitar problemas comuns como **acoplamento excessivo e dificuldade de manutenção**.

## ✨ Os 5 Princípios do SOLID

### **S - Princípio da Responsabilidade Única (SRP - Single Responsibility Principle)**
📌 **Cada classe deve ter apenas uma única responsabilidade.**  
➡️ Isso facilita **manutenção, testes** e evita que mudanças em um requisito impactem outras funcionalidades.

### **O - Princípio Aberto/Fechado (OCP - Open/Closed Principle)**
📌 **Uma classe deve estar aberta para extensão, mas fechada para modificação.**  
➡️ Podemos **adicionar novos comportamentos** sem alterar o código existente.

### **L - Princípio da Substituição de Liskov (LSP - Liskov Substitution Principle)**
📌 **Subclasses devem substituir a classe base sem causar efeitos colaterais.**  
➡️ Uma subclasse **não deve alterar** o comportamento esperado da classe base.

### **I - Princípio da Segregação de Interfaces (ISP - Interface Segregation Principle)**
📌 **Uma classe não deve ser forçada a implementar métodos que não usa.**  
➡️ Interfaces menores **evitam código desnecessário** e aumentam a **coesão**.

### **D - Princípio da Inversão de Dependência (DIP - Dependency Inversion Principle)**
📌 **Módulos de alto nível não devem depender de módulos de baixo nível, mas sim de abstrações.**  
➡️ Isso permite que os **componentes do sistema** sejam facilmente substituídos.

---

## 🚀 Benefícios de Aplicar SOLID
✅ Código **mais limpo e organizado**  
✅ Melhor **manutenção e testabilidade**  
✅ Facilidade para **adicionar novas funcionalidades**  
✅ Redução de **acoplamento** e aumento da **coesão**
