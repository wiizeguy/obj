import java.util.ArrayList;

static class User {
	public String nickname;
	String passwordHash;

	User(String nickname, String passwordHash) {
		this.nickname = nickname;
		this.passwordHash = passwordHash;
	}

	public void greet() {
		System.out.printf("Hiya, I'm %s%n", this.nickname);
	}
}

static class Attachment {
	public String filename;
	public String mimeType;

	Attachment(String filename, String mimeType) {
		this.filename = filename;
		this.mimeType = mimeType;
	}

	public void whatAmI() {
		switch (this.mimeType) {
		case "application/octet-stream": System.out.printf("(%s) I am binary data!%n", this.filename); break;
		case "audio/mpeg": System.out.printf("(%s) I am audio data!%n", this.filename); break;
		case "image/png": System.out.printf("(%s) I am an image!%n", this.filename); break;
		default: System.out.printf("(%s) No clue what I am...%n", this.filename); break;
		}
	}
}

static class Message {
	public User sender;
	public String content;
	public ArrayList<Attachment> attachments;

	Message(User sender, String content) {
		this.sender = sender;
		this.content = content;
		this.attachments = new ArrayList<Attachment>();
	}

	public void bindAttachment(Attachment attachment) {
		this.attachments.add(attachment);
	}

	public void say() {
		System.out.printf("[%s] %s%n", this.sender.nickname, this.content);
		if (!this.attachments.isEmpty()) {
			System.out.print("Attachments: ");
			for (Attachment atch : this.attachments)
				System.out.printf("(%s:%s) ", atch.filename, atch.mimeType);
			System.out.println();
			for (Attachment atch : this.attachments)
				atch.whatAmI();
		}
	}
}

static class Chat {
	public ArrayList<User> members;
	public User admin;
	public ArrayList<Message> messages;

	Chat() {
		this.members = new ArrayList<User>();
		this.admin = null;
		this.messages = new ArrayList<Message>();
	}

	public void addMember(User member) {
		this.members.add(member);
	}

	public void setAdmin(User newAdmin) {
		this.admin = newAdmin;
	}

	public void addMessage(Message msg) {
		this.messages.add(msg);
	}

	public void displayLog() {
		for (Message msg : this.messages)
			msg.say();
	}
}

public static void main(String[] args) {
	User bob = new User("Bob", "...");
	User alice = new User("Alice", "...");
	User mallory = new User("Mallory", "...");

	Chat chat = new Chat();
	chat.setAdmin(bob);
	chat.addMember(alice);
	chat.addMember(mallory);

	chat.addMessage(new Message(bob, "Hey"));
	chat.addMessage(new Message(alice, "Hello World!"));

	Message malloryMsg = new Message(mallory, "Wassup");
	Attachment atch = new Attachment("cats.png", "image/png");
	malloryMsg.bindAttachment(atch);
	chat.addMessage(malloryMsg);

	chat.displayLog();
}