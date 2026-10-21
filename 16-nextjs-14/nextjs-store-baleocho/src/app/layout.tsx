import { Header } from 'app/components/shared/Header';
import { Footer } from 'app/components/shared/Footer';

export default function RootLayout({ children }: LayoutProps<"/">) {
  return (
    <html lang="en">
      <body style={{background: 'gray'}}>
        <Header />
        {children}
        <Footer />
      </body>
    </html>
  );
}
