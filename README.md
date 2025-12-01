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

---

# ⚙️ Como Instalar e Rodar

### 1️⃣ Clonar o repositório

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

# 🌐 Explicação da API

### 👇 ViaCEP

- A API ViaCEP é um serviço público e gratuito que permite consultar informações de endereços brasileiros usando apenas um CEP ou parte de um endereço. Ela funciona por meio de requisições HTTP simples, sem necessidade de autenticação ou chave de API.

- Quando você faz uma requisição informando um CEP, a API retorna um conjunto de dados relacionados àquele endereço. Esses dados geralmente incluem logradouro (rua), bairro, cidade, estado, código IBGE, DDD e outras informações úteis. A API pode responder em diferentes formatos, como JSON, XML e outros formatos alternativos, mas o JSON é o mais usado.

- O funcionamento básico ocorre da seguinte forma: você envia um CEP para o endpoint da API no formato /ws/{CEP}/json/. A API então busca esse CEP em sua base de dados e devolve as informações correspondentes. Caso o CEP pesquisado não exista, ela retorna um campo indicando erro.

- Além da consulta direta por CEP, também é possível fazer buscas utilizando UF (estado), cidade e nome do logradouro. Nesse caso, a API retorna uma lista de endereços possíveis que correspondem aos termos informados.

- Por ser um serviço simples, rápido e sem limite rígido de uso, a API é amplamente utilizada em sistemas de cadastro, formulários automáticos e validação de endereços em geral.


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

# 👨‍💻 Autores

| Nome | RA | Contato |
|------|------|---------|
| **Felipe Oliveira** | 2404017 | felipe.alcantara@aluno.faculdadeimpacta.com.br |
| **Leonardo Cirino** | 2202296 | leonardo.cirino@aluno.faculdadeimpacta.com.br |
| **Rafael Ferracini** | 2403329 | rafael.ferracini@aluno.faculdadeimpacta.com.br |
| **Gustavo Bezerra** | 2403495 | gustavo.bezerra@aluno.faculdadeimpacta.com.br |

