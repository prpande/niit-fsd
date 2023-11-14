export type User = {
    firstName?: string;
    lastName?: string;
    email?: string;
    password?: string;
    gender?: string;
    age?: number;
    phone?: number;
    address?: {
        street?: string;
        city?: string;
        state?: string;
        zipCode?: string;
    }
}