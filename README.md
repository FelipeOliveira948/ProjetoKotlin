# 🚌 Bus School

## 📌 Descrição do App  
O **Bus School** é um aplicativo desenvolvido para motoristas de transporte escolar, oferecendo ferramentas práticas para gerenciar alunos, rotas, cadastros e informações essenciais no dia a dia da operação.  

O app torna o processo mais **seguro, organizado e eficiente**, centralizando tudo em um único ambiente.

Ele foi projetado com foco em:

- ✔️ Simplicidade  
- ✔️ Rapidez  
- ✔️ Facilidade de navegação  
- ✔️ Interface clara  
- ✔️ Uso durante a rotina real dos motoristas  

---

# 🖼️ Prints das Telas

### 📍 Tela Home
<img src="screenshots/Captura de tela 2025-12-01 151952.png" width="280"/>

### 📂 Menu Lateral (Navigation Drawer)
<img src="screenshots/Captura de tela 2025-12-01 152013.png" width="280"/>

### 🧑‍🎓 Tela de Registro de Perfis (Exemplo)
<img src="screenshots/Captura de tela 2025-12-01 152020.png" width="280"/>

### 📋 Tela de Cadastros (Exemplo)
<img src="screenshots/Captura de tela 2025-12-01 152027.png" width="280"/>

---

# 🛠️ Tecnologias Utilizadas

## 📱 Frontend (Android)
- Kotlin  
- Android Jetpack:  
  - ViewModel  
  - LiveData  
  - Navigation Component  
  - Fragments  
- Material Design 3  
- RecyclerView  
- ViewBinding  
- ConstraintLayout  
- Google Maps API (se ativada)

## 🌐 Backend (se existir API)
- Python (Flask / FastAPI) **ou** Node.js (Express)  
- Banco de dados SQL ou NoSQL  

*(Posso adaptar esta parte conforme seu backend real.)*

---

# ⚙️ Como Instalar e Rodar

### 1️⃣ Clonar o repositório
```sh
git clone https://github.com/FelipeOliveira948/ProjetoKotlin.git

## ⚙️ Como Instalar e Rodar

### 2️⃣ Abrir no Android Studio
1. Abra o **Android Studio**  
2. Clique em **Open Project**  
3. Selecione a pasta **Bus School**

---

### 3️⃣ Sincronizar o Gradle
O Android Studio sincroniza automaticamente, mas caso precise:


---

### 4️⃣ Rodar o App
1. Conecte um dispositivo físico **ou** inicie um emulador  
2. Clique no botão **Run ▶️**

---

# 🌐 Endpoints da API (Se houver)

> Estes são modelos genéricos — posso substituir pelos reais quando você quiser.

### 👇 Endpoints

| Método | Rota | Descrição |
|--------|-------|-------------|
| **GET** | `/alunos` | Retorna todos os alunos |
| **GET** | `/alunos/{id}` | Busca um aluno específico |
| **POST** | `/alunos` | Cadastra um novo aluno |
| **PUT** | `/alunos/{id}` | Atualiza os dados de um aluno |
| **DELETE** | `/alunos/{id}` | Remove um aluno |

---

# 🔄 Como o CRUD Funciona

### 🟩 **Create — Criar**
Motorista cadastra novos alunos via formulário → Salvo no banco local ou API.

### 🟦 **Read — Ler**
A lista de alunos aparece usando **RecyclerView**.

### 🟨 **Update — Atualizar**
Campos podem ser editados em telas específicas.

### 🟥 **Delete — Excluir**
O aluno pode ser removido diretamente na listagem.

---

# 📚 Funções Implementadas

- ✔️ Tela Home  
- ✔️ Navigation Drawer  
- ✔️ Tela de Alunos  
- ✔️ Tela de Cadastros  
- ✔️ Botões para cadastro e listagem  
- ✔️ Cadastro completo de responsáveis  
- ✔️ Cadastro de turmas  
- ✔️ Cadastro de escolas  
- ✔️ Cadastro de funcionários  
- ✔️ Integração com API  
- ✔️ Controle de presença  
- ✔️ Sistema de rotas no mapa  
- ✔️ Notificações  

---
