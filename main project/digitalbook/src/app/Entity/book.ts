export default class Book {
    image: String = '';
    title: String = '';
    category: String = '';
    price: number = 0;
    author: String = '';
    publisher: String = '';
    publishedDate: String = '';
    isActive: Boolean = true;
    content: String = '';
}

export class SearchBook {
    title: String = '';
    author: String = '';
    publisher: String = '';
    category: String = '';
}